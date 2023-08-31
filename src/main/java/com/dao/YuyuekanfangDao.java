package com.dao;

import com.entity.YuyuekanfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuekanfangVO;
import com.entity.view.YuyuekanfangView;


/**
 * 预约看房
 * 
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
public interface YuyuekanfangDao extends BaseMapper<YuyuekanfangEntity> {
	
	List<YuyuekanfangVO> selectListVO(@Param("ew") Wrapper<YuyuekanfangEntity> wrapper);
	
	YuyuekanfangVO selectVO(@Param("ew") Wrapper<YuyuekanfangEntity> wrapper);
	
	List<YuyuekanfangView> selectListView(@Param("ew") Wrapper<YuyuekanfangEntity> wrapper);

	List<YuyuekanfangView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuekanfangEntity> wrapper);
	
	YuyuekanfangView selectView(@Param("ew") Wrapper<YuyuekanfangEntity> wrapper);
	

}
