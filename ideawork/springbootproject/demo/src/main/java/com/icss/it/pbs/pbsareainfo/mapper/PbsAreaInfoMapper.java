package com.icss.it.pbs.pbsareainfo.mapper;

import com.icss.it.pbs.pbsareainfo.model.PbsAreaInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PbsAreaInfoMapper {

    PbsAreaInfo selectByPrimaryKey(String uuid);

    List<PbsAreaInfo> selectByParam(PbsAreaInfo pbsAreaInfo);

    int updateByPrimaryKey(PbsAreaInfo pbsAreaInfo);

    int deleteByPrimaryKey(String uuid);

    int deleteByPrimaryKeys(List<String> uuids);

    int insert(PbsAreaInfo pbsAreaInfo);

    int insertBatch(List<PbsAreaInfo> pbsAreaInfos);
}
