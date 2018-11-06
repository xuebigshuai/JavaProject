package com.icss.it.pbs.pbsareainfo.service;

import com.icss.it.pbs.pbsareainfo.model.PbsAreaInfo;
import com.icss.it.pbs.pbsareainfo.mapper.PbsAreaInfoMapper;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PbsAreaInfoService {

    @Autowired
    private PbsAreaInfoMapper pbsAreaInfoMapper;

    public PbsAreaInfo selectByPrimaryKey(String uuid) {
        return pbsAreaInfoMapper.selectByPrimaryKey(uuid);
    }

    public List<PbsAreaInfo> selectByParam(PbsAreaInfo pbsAreaInfo) {
        return pbsAreaInfoMapper.selectByParam(pbsAreaInfo);
    }

    public int updateByPrimaryKey(PbsAreaInfo pbsAreaInfo) {
        return pbsAreaInfoMapper.updateByPrimaryKey(pbsAreaInfo);
    }

    public int deleteByPrimaryKey(String uuid) {
        return pbsAreaInfoMapper.deleteByPrimaryKey(uuid);
    }

    public int deleteByPrimaryKeys(List<String> uuids) {
        return pbsAreaInfoMapper.deleteByPrimaryKeys(uuids);
    }

    public int insert(PbsAreaInfo pbsAreaInfo) {
        return pbsAreaInfoMapper.insert(pbsAreaInfo);
    }

    public int insertBatch(List<PbsAreaInfo> pbsAreaInfos) {
        return pbsAreaInfoMapper.insertBatch(pbsAreaInfos);
    }
}
