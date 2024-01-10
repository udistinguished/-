package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiatingzhichuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiatingzhichuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiatingzhichuView;


/**
 * 家庭支出
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface JiatingzhichuService extends IService<JiatingzhichuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiatingzhichuVO> selectListVO(Wrapper<JiatingzhichuEntity> wrapper);
   	
   	JiatingzhichuVO selectVO(@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);
   	
   	List<JiatingzhichuView> selectListView(Wrapper<JiatingzhichuEntity> wrapper);
   	
   	JiatingzhichuView selectView(@Param("ew") Wrapper<JiatingzhichuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiatingzhichuEntity> wrapper);
   	
}

