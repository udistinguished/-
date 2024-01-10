package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiatingshouruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiatingshouruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiatingshouruView;


/**
 * 家庭收入
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface JiatingshouruService extends IService<JiatingshouruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiatingshouruVO> selectListVO(Wrapper<JiatingshouruEntity> wrapper);
   	
   	JiatingshouruVO selectVO(@Param("ew") Wrapper<JiatingshouruEntity> wrapper);
   	
   	List<JiatingshouruView> selectListView(Wrapper<JiatingshouruEntity> wrapper);
   	
   	JiatingshouruView selectView(@Param("ew") Wrapper<JiatingshouruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiatingshouruEntity> wrapper);
   	
}

