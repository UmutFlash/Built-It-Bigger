package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void testJokes() throws Exception {
        try {
            MainActivity mainActivity = new MainActivity();
            EndpointsAsyncTask endpointsTask = new EndpointsAsyncTask(mainActivity);
            endpointsTask.execute();
            String result = endpointsTask.get(10, TimeUnit.SECONDS);

            assertNotNull(result);
        } catch (Exception e) {
            Log.e("EndpointsAsyncTaskTest", e.getMessage());
        }
    }
}
