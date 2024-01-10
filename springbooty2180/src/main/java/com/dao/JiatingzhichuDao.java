package com.dao;

import com.entity.JiatingzhichuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiatingzhichuVO;
import com.entity.view.JiatingzhichuView;


/**
 * 家庭支出
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface JiatingzhichuDao extends BaseMapper<JiatingzhichuEntity> {
	
	List<JiatingzhichuVO> selectListVO(@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);
	
	JiatingzhichuVO selectVO(@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);
	
	List<JiatingzhichuView> selectListView(@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);

	List<JiatingzhichuView> selectListView(Pagination page,@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);
	
	JiatingzhichuView selectView(@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);
	
}
