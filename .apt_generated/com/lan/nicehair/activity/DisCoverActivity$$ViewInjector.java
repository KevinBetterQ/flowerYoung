// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DisCoverActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.DisCoverActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165238);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165238' for field 'mTopBar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTopBar = (com.lan.nicehair.widget.TopBarView) view;
  }

  public static void reset(com.lan.nicehair.activity.DisCoverActivity target) {
    target.mTopBar = null;
  }
}
