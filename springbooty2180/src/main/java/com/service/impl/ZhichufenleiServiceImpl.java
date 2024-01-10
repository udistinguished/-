package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhichufenleiDao;
import com.entity.ZhichufenleiEntity;
import com.service.ZhichufenleiService;
import com.entity.vo.ZhichufenleiVO;
import com.entity.view.ZhichufenleiView;

@Service("zhichufenleiService")
public class ZhichufenleiServiceImpl extends ServiceImpl<ZhichufenleiDao, ZhichufenleiEntity> implements ZhichufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichufenleiEntity> page = this.selectPage(
                new Query<ZhichufenleiEntity>(params).getPage(),
                new EntityWrapper<ZhichufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichufenleiEntity> wrapper) {
		  Page<ZhichufenleiView> page =new Query<ZhichufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichufenleiVO> selectListVO(Wrapper<ZhichufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichufenleiVO selectVO(Wrapper<ZhichufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichufenleiView> selectListView(Wrapper<ZhichufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichufenleiView selectView(Wrapper<ZhichufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
