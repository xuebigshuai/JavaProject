package com.it.po.pbspobaseinfo.mapper;

import com.it.po.pbspobaseinfo.model.PbsPoBaseInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PbsPoBaseInfoMapper {

    PbsPoBaseInfo selectByPrimaryKey(String uuid);

    List<PbsPoBaseInfo> selectByParam(PbsPoBaseInfo pbsPoBaseInfo);

    int updateByPrimaryKey(PbsPoBaseInfo pbsPoBaseInfo);

    int deleteByPrimaryKey(String uuid);

    int deleteByPrimaryKeys(List<String> uuids);

    int insert(PbsPoBaseInfo pbsPoBaseInfo);

    int insertBatch(List<PbsPoBaseInfo> pbsPoBaseInfos);
}
