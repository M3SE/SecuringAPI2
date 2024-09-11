package com.example.securingapi2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @InjectMocks
    private MyService myService;

    @Mock
    private CacheManager cacheManager;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        cacheManager = new ConcurrentMapCacheManager("myCache");
        myService = new MyService();
    }

    @Test
    public void testGetData() {
        String id = "1";
        String expectedData = "data";

        // Call the method
        String actualData = myService.getData(id);

        // Verify the result
        assertEquals(expectedData, actualData);
    }

    @Test
    public void testUpdateData() {
        String id = "1";
        String newData = "newData";

        // Call the method
        String actualData = myService.updateData(id, newData);

        // Verify the result
        assertEquals(newData, actualData);
    }

    @Test
    public void testEvictData() {
        String id = "1";

        // Call the method
        myService.evictData(id);

        // Verify the cache is evicted
        assertEquals(null, cacheManager.getCache("myCache").get(id));
    }
}