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


import com.dao.JiatingzhichuDao;
import com.entity.JiatingzhichuEntity;
import com.service.JiatingzhichuService;
import com.entity.vo.JiatingzhichuVO;
import com.entity.view.JiatingzhichuView;

@Service("jiatingzhichuService")
public class JiatingzhichuServiceImpl extends ServiceImpl<JiatingzhichuDao, JiatingzhichuEntity> implements JiatingzhichuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiatingzhichuEntity> page = this.selectPage(
                new Query<JiatingzhichuEntity>(params).getPage(),
                new EntityWrapper<JiatingzhichuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiatingzhichuEntity> wrapper) {
		  Page<JiatingzhichuView> page =new Query<JiatingzhichuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiatingzhichuVO> selectListVO(Wrapper<JiatingzhichuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiatingzhichuVO selectVO(Wrapper<JiatingzhichuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiatingzhichuView> selectListView(Wrapper<JiatingzhichuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiatingzhichuView selectView(Wrapper<JiatingzhichuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
