package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FamilyAccountEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FamilyAccountVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FamilyAccountView;


/**
 * 家庭账户
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface JiatingzhanghuService extends IService<FamilyAccountEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FamilyAccountVO> selectListVO(Wrapper<FamilyAccountEntity> wrapper);
   	
   	FamilyAccountVO selectVO(@Param("ew") Wrapper<FamilyAccountEntity> wrapper);
   	
   	List<FamilyAccountView> selectListView(Wrapper<FamilyAccountEntity> wrapper);
   	
   	FamilyAccountView selectView(@Param("ew") Wrapper<FamilyAccountEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FamilyAccountEntity> wrapper);
   	
}

