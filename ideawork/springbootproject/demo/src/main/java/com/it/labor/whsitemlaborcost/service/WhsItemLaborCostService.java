package com.it.labor.whsitemlaborcost.service;

import com.it.labor.whsitemlaborcost.model.WhsItemLaborCost;
import com.it.labor.whsitemlaborcost.mapper.WhsItemLaborCostMapper;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class WhsItemLaborCostService {

    @Autowired
    private WhsItemLaborCostMapper whsItemLaborCostMapper;

    public WhsItemLaborCost selectByPrimaryKey(String uuid) {
        return whsItemLaborCostMapper.selectByPrimaryKey(uuid);
    }

    public List<WhsItemLaborCost> selectByParam(WhsItemLaborCost whsItemLaborCost) {
        return whsItemLaborCostMapper.selectByParam(whsItemLaborCost);
    }

    public int updateByPrimaryKey(WhsItemLaborCost whsItemLaborCost) {
        return whsItemLaborCostMapper.updateByPrimaryKey(whsItemLaborCost);
    }

    public int deleteByPrimaryKey(String uuid) {
        return whsItemLaborCostMapper.deleteByPrimaryKey(uuid);
    }

    public int deleteByPrimaryKeys(List<String> uuids) {
        return whsItemLaborCostMapper.deleteByPrimaryKeys(uuids);
    }

    public int insert(WhsItemLaborCost whsItemLaborCost) {
        return whsItemLaborCostMapper.insert(whsItemLaborCost);
    }

    public int insertBatch(List<WhsItemLaborCost> whsItemLaborCosts) {
        return whsItemLaborCostMapper.insertBatch(whsItemLaborCosts);
    }
}
