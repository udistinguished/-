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


import com.dao.TouzilicaiDao;
import com.entity.TouzilicaiEntity;
import com.service.TouzilicaiService;
import com.entity.vo.TouzilicaiVO;
import com.entity.view.TouzilicaiView;

@Service("touzilicaiService")
public class TouzilicaiServiceImpl extends ServiceImpl<TouzilicaiDao, TouzilicaiEntity> implements TouzilicaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TouzilicaiEntity> page = this.selectPage(
                new Query<TouzilicaiEntity>(params).getPage(),
                new EntityWrapper<TouzilicaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TouzilicaiEntity> wrapper) {
		  Page<TouzilicaiView> page =new Query<TouzilicaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TouzilicaiVO> selectListVO(Wrapper<TouzilicaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TouzilicaiVO selectVO(Wrapper<TouzilicaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TouzilicaiView> selectListView(Wrapper<TouzilicaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TouzilicaiView selectView(Wrapper<TouzilicaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
