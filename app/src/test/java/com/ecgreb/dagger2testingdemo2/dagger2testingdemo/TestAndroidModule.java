package com.ecgreb.dagger2testingdemo2.dagger2testingdemo;

import com.ecgreb.dagger2testingdemo1.StringFactory;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestAndroidModule {
    private final TestMyApplication application;

    public TestAndroidModule(TestMyApplication application) {
        this.application = application;
    }

    @Provides @Singleton StringFactory provideStringFactory() {
        StringFactory mockStringFactory = Mockito.mock(StringFactory.class);
        Mockito.when(mockStringFactory.makeText()).thenReturn("Fake greeting");
        return mockStringFactory;
    }
}
