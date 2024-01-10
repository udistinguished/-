package com.dao;

import com.entity.YinxingchuxuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinxingchuxuVO;
import com.entity.view.YinxingchuxuView;


/**
 * 银行储蓄
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface YinxingchuxuDao extends BaseMapper<YinxingchuxuEntity> {
	
	List<YinxingchuxuVO> selectListVO(@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);
	
	YinxingchuxuVO selectVO(@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);
	
	List<YinxingchuxuView> selectListView(@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);

	List<YinxingchuxuView> selectListView(Pagination page,@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);
	
	YinxingchuxuView selectView(@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);
	
}
