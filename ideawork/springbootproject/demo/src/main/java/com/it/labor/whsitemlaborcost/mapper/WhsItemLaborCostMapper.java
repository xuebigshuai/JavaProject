package com.it.labor.whsitemlaborcost.mapper;

import com.it.labor.whsitemlaborcost.model.WhsItemLaborCost;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WhsItemLaborCostMapper {

    WhsItemLaborCost selectByPrimaryKey(String uuid);

    List<WhsItemLaborCost> selectByParam(WhsItemLaborCost whsItemLaborCost);

    int updateByPrimaryKey(WhsItemLaborCost whsItemLaborCost);

    int deleteByPrimaryKey(String uuid);

    int deleteByPrimaryKeys(List<String> uuids);

    int insert(WhsItemLaborCost whsItemLaborCost);

    int insertBatch(List<WhsItemLaborCost> whsItemLaborCosts);
}
