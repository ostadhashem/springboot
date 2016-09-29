package com.viafoura.sample.boot.controller;

import com.viafoura.sample.boot.service.SomeService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.mockito.Mockito.*;

/**
 * Tests {@link AddressController}
 */
public class AddressControllerTest{

    @InjectMocks
    AddressController addressController;
    @Mock
    SomeService someService;

    @BeforeClass
    void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetName() throws Exception {
        when(someService.getName()).thenReturn("Answer");
        Assert.assertEquals("Answer", addressController.getName(),
                "The controller does not return the same value as someService returned");
        verify(someService,times(1)).getName();

    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void testGetNameWithException(){
        when(someService.getName()).thenThrow(new IllegalStateException());
        addressController.getName();
    }
}