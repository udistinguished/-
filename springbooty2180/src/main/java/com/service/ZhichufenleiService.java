package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichufenleiView;


/**
 * 支出分类
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface ZhichufenleiService extends IService<ZhichufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichufenleiVO> selectListVO(Wrapper<ZhichufenleiEntity> wrapper);
   	
   	ZhichufenleiVO selectVO(@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);
   	
   	List<ZhichufenleiView> selectListView(Wrapper<ZhichufenleiEntity> wrapper);
   	
   	ZhichufenleiView selectView(@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichufenleiEntity> wrapper);
   	
}

