/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.xdai.demoapplication;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import javax.inject.Inject;

public class HomeActivity extends FragmentActivity {
  @Inject LocationManager locationManager;
    private HomeActivityComponent component;
    HomeActivityComponent initComponent() {
    return component;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.component =  Dagger_HomeActivityComponent.builder()
        .applicationComponent(((DemoApplication) getApplication()).component())
        .activityModule(new ActivityModule(this))
        .build();
      component.inject(this);

    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .add(android.R.id.content, new HomeFragment())
          .commit();
    }

    // TODO do something with the injected dependencies here!
  }
}
