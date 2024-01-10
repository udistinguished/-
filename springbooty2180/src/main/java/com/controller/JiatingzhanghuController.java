package com.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.FamilyAccountEntity;
import com.entity.view.FamilyAccountView;

import com.service.JiatingzhanghuService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;


/**
 * 家庭账户
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
@RestController
@RequestMapping("/jiatingzhanghu")
public class JiatingzhanghuController {
    @Autowired
    private JiatingzhanghuService jiatingzhanghuService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, FamilyAccountEntity jiatingzhanghu,
                  HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiatingzhanghu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FamilyAccountEntity> ew = new EntityWrapper<FamilyAccountEntity>();
		PageUtils page = jiatingzhanghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiatingzhanghu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, FamilyAccountEntity jiatingzhanghu, HttpServletRequest request){
        EntityWrapper<FamilyAccountEntity> ew = new EntityWrapper<FamilyAccountEntity>();
		PageUtils page = jiatingzhanghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiatingzhanghu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FamilyAccountEntity jiatingzhanghu){
       	EntityWrapper<FamilyAccountEntity> ew = new EntityWrapper<FamilyAccountEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiatingzhanghu, "jiatingzhanghu")); 
        return R.ok().put("data", jiatingzhanghuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FamilyAccountEntity jiatingzhanghu){
        EntityWrapper<FamilyAccountEntity> ew = new EntityWrapper<FamilyAccountEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiatingzhanghu, "jiatingzhanghu")); 
		FamilyAccountView familyAccountView =  jiatingzhanghuService.selectView(ew);
		return R.ok("查询家庭账户成功").put("data", familyAccountView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FamilyAccountEntity jiatingzhanghu = jiatingzhanghuService.selectById(id);
        return R.ok().put("data", jiatingzhanghu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FamilyAccountEntity jiatingzhanghu = jiatingzhanghuService.selectById(id);
        return R.ok().put("data", jiatingzhanghu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FamilyAccountEntity jiatingzhanghu, HttpServletRequest request){
    	jiatingzhanghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiatingzhanghu);
        jiatingzhanghuService.insert(jiatingzhanghu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FamilyAccountEntity jiatingzhanghu, HttpServletRequest request){
    	jiatingzhanghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiatingzhanghu);
        jiatingzhanghuService.insert(jiatingzhanghu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FamilyAccountEntity jiatingzhanghu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiatingzhanghu);
        jiatingzhanghuService.updateById(jiatingzhanghu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiatingzhanghuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FamilyAccountEntity> wrapper = new EntityWrapper<FamilyAccountEntity>();
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

		int count = jiatingzhanghuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
