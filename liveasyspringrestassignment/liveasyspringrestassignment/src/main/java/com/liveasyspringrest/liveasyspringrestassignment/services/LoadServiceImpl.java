package com.liveasyspringrest.liveasyspringrestassignment.services;

import com.liveasyspringrest.liveasyspringrestassignment.dao.LoadDao;
import com.liveasyspringrest.liveasyspringrestassignment.entities.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadServiceImpl implements LoadService{

    @Autowired
    private LoadDao loadDao;

    @Override
    public Load addLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public List<Load> getLoads(){
        return loadDao.findAll();
    }

    @Override
    public Load getLoad(Long shipperId){
        return loadDao.findByshipperId(shipperId);
    }

    @Override
    public Load updateLoadByShipperId(long shipperId, Load load) {
        // Check if a Load with the given shipperId exists in the database
        Optional<Load> existingLoad = loadDao.findByShipperId(shipperId);

        if (existingLoad.isPresent()) {
            // If a matching record is found, update its properties
            Load existing = existingLoad.get();
            existing.setLoadingPoint(load.getLoadingPoint());
            existing.setUnloadingPoint(load.getUnloadingPoint());
            existing.setProductType(load.getProductType());
            existing.setTruckType(load.getTruckType());
            existing.setNoOfTrucks(load.getNoOfTrucks());
            existing.setWeight(load.getWeight());
            existing.setComment(load.getComment());
            existing.setLoadDate(load.getLoadDate());

            // Save the updated Load record
            return loadDao.save(existing);
        } else {
            // If no matching record is found, create a new record
            return loadDao.save(load);
        }
    }

    @Override
    public boolean deleteLoadByShipperId(long shipperId) {
        // Checking if a Load with the given shipperId exists in the database
        Optional<Load> existingLoad = loadDao.findByShipperId(shipperId);

        if (existingLoad.isPresent()) {
            // If a matching record is found, deleting it
            loadDao.delete(existingLoad.get());
            return true;
        } else {
            // If no matching record is found, returning false to indicate that the load doesn't exist
            return false;
        }
    }

}
