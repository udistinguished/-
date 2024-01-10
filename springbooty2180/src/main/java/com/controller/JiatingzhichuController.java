package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiatingzhichuEntity;
import com.entity.view.JiatingzhichuView;

import com.service.JiatingzhichuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 家庭支出
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@RestController
@RequestMapping("/jiatingzhichu")
public class JiatingzhichuController {
    @Autowired
    private JiatingzhichuService jiatingzhichuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiatingzhichuEntity jiatingzhichu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiatingzhichu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiatingzhichuEntity> ew = new EntityWrapper<JiatingzhichuEntity>();
		PageUtils page = jiatingzhichuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiatingzhichu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiatingzhichuEntity jiatingzhichu, HttpServletRequest request){
        EntityWrapper<JiatingzhichuEntity> ew = new EntityWrapper<JiatingzhichuEntity>();
		PageUtils page = jiatingzhichuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiatingzhichu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiatingzhichuEntity jiatingzhichu){
       	EntityWrapper<JiatingzhichuEntity> ew = new EntityWrapper<JiatingzhichuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiatingzhichu, "jiatingzhichu")); 
        return R.ok().put("data", jiatingzhichuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiatingzhichuEntity jiatingzhichu){
        EntityWrapper< JiatingzhichuEntity> ew = new EntityWrapper< JiatingzhichuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiatingzhichu, "jiatingzhichu")); 
		JiatingzhichuView jiatingzhichuView =  jiatingzhichuService.selectView(ew);
		return R.ok("查询家庭支出成功").put("data", jiatingzhichuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiatingzhichuEntity jiatingzhichu = jiatingzhichuService.selectById(id);
        return R.ok().put("data", jiatingzhichu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiatingzhichuEntity jiatingzhichu = jiatingzhichuService.selectById(id);
        return R.ok().put("data", jiatingzhichu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiatingzhichuEntity jiatingzhichu, HttpServletRequest request){
    	jiatingzhichu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiatingzhichu);
        jiatingzhichuService.insert(jiatingzhichu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiatingzhichuEntity jiatingzhichu, HttpServletRequest request){
    	jiatingzhichu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiatingzhichu);
        jiatingzhichuService.insert(jiatingzhichu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiatingzhichuEntity jiatingzhichu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiatingzhichu);
        jiatingzhichuService.updateById(jiatingzhichu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiatingzhichuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiatingzhichuEntity> wrapper = new EntityWrapper<JiatingzhichuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = jiatingzhichuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
