package com.it.po.pbspobaseinfo.service;

import com.it.po.pbspobaseinfo.model.PbsPoBaseInfo;
import com.it.po.pbspobaseinfo.mapper.PbsPoBaseInfoMapper;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PbsPoBaseInfoService {

    @Autowired
    private PbsPoBaseInfoMapper pbsPoBaseInfoMapper;

    public PbsPoBaseInfo selectByPrimaryKey(String uuid) {
        return pbsPoBaseInfoMapper.selectByPrimaryKey(uuid);
    }

    public List<PbsPoBaseInfo> selectByParam(PbsPoBaseInfo pbsPoBaseInfo) {
        return pbsPoBaseInfoMapper.selectByParam(pbsPoBaseInfo);
    }

    public int updateByPrimaryKey(PbsPoBaseInfo pbsPoBaseInfo) {
        return pbsPoBaseInfoMapper.updateByPrimaryKey(pbsPoBaseInfo);
    }

    public int deleteByPrimaryKey(String uuid) {
        return pbsPoBaseInfoMapper.deleteByPrimaryKey(uuid);
    }

    public int deleteByPrimaryKeys(List<String> uuids) {
        return pbsPoBaseInfoMapper.deleteByPrimaryKeys(uuids);
    }

    public int insert(PbsPoBaseInfo pbsPoBaseInfo) {
        return pbsPoBaseInfoMapper.insert(pbsPoBaseInfo);
    }

    public int insertBatch(List<PbsPoBaseInfo> pbsPoBaseInfos) {
        return pbsPoBaseInfoMapper.insertBatch(pbsPoBaseInfos);
    }
}
