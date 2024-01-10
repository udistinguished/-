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


import com.dao.ShourufenleiDao;
import com.entity.ShourufenleiEntity;
import com.service.ShourufenleiService;
import com.entity.vo.ShourufenleiVO;
import com.entity.view.ShourufenleiView;

@Service("shourufenleiService")
public class ShourufenleiServiceImpl extends ServiceImpl<ShourufenleiDao, ShourufenleiEntity> implements ShourufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShourufenleiEntity> page = this.selectPage(
                new Query<ShourufenleiEntity>(params).getPage(),
                new EntityWrapper<ShourufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShourufenleiEntity> wrapper) {
		  Page<ShourufenleiView> page =new Query<ShourufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShourufenleiVO> selectListVO(Wrapper<ShourufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShourufenleiVO selectVO(Wrapper<ShourufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShourufenleiView> selectListView(Wrapper<ShourufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShourufenleiView selectView(Wrapper<ShourufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
