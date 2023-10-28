package com.liveasyspringrest.liveasyspringrestassignment.services;

import com.liveasyspringrest.liveasyspringrestassignment.entities.Load;

import java.util.List;

public interface LoadService {
    public Load addLoad(Load load);
    public List<Load> getLoads();
    public Load getLoad(Long shipperId);

    public Load updateLoadByShipperId(long shipperId, Load load);

    boolean deleteLoadByShipperId(long shipperId);

}
