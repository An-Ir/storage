package com.example.storage.domain.storagefeature;

import com.example.storage.domain.storage.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StorageFeatureRepository extends JpaRepository<StorageFeature, Integer> {

    @Query("SELECT sf.storage FROM StorageFeature sf where sf.feature.id IN :featureIds AND " +
            "(sf.storage.location.county.id = :countyId or :countyId = 0) " +
            "GROUP BY sf.storage HAVING COUNT(DISTINCT sf.feature.id) = :numFeatures")
    List<Storage> findStoragesByFeatureIds(Integer countyId, List<Integer> featureIds, int numFeatures);


}