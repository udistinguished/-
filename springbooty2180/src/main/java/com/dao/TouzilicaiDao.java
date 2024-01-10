package com.dao;

import com.entity.TouzilicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TouzilicaiVO;
import com.entity.view.TouzilicaiView;


/**
 * 投资理财
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface TouzilicaiDao extends BaseMapper<TouzilicaiEntity> {
	
	List<TouzilicaiVO> selectListVO(@Param("ew") Wrapper<TouzilicaiEntity> wrapper);
	
	TouzilicaiVO selectVO(@Param("ew") Wrapper<TouzilicaiEntity> wrapper);
	
	List<TouzilicaiView> selectListView(@Param("ew") Wrapper<TouzilicaiEntity> wrapper);

	List<TouzilicaiView> selectListView(Pagination page,@Param("ew") Wrapper<TouzilicaiEntity> wrapper);
	
	TouzilicaiView selectView(@Param("ew") Wrapper<TouzilicaiEntity> wrapper);
	
}
