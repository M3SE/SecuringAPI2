package com.example.securingapi2.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Cacheable("myCache")
    public String getData(String id) {
        // Method implementation
        return "data";
    }

    @CachePut(value = "myCache", key = "#id")
    public String updateData(String id, String newData) {
        // Method implementation
        return newData;
    }

    @CacheEvict(value = "myCache", key = "#id")
    public void evictData(String id) {
        // Method implementation
    }
}