package com.example.storage.domain.storage;

import com.example.storage.business.storage.dto.StorageDetailedInfo;
import com.example.storage.business.storage.dto.StorageImageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StorageMapper {

    @Mapping(source = "name", target = "storageName")
    @Mapping(source = "id", target = "storageId")
    @Mapping(source = "price", target = "storagePrice")
    StorageImageInfo toStorageInfo(Storage storage);

    List<StorageImageInfo> toStorageInfos(List<Storage> storages);


    @Mapping(source = "squareMeters", target = "area")
    @Mapping(source = "description", target = "description")
    @Mapping(constant = "A", target = "status")
    @Mapping(source = "price", target = "price")
    Storage toStorage(StorageDetailedInfo storageDetailedInfo);


}