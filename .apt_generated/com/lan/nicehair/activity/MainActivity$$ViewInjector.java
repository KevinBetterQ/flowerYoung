// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.MainActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165456);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165456' for field 'mTabHost' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTabHost = (android.widget.TabHost) view;
    view = finder.findById(source, 2131165458);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165458' for field 'mRadioGroup' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mRadioGroup = (android.widget.RadioGroup) view;
    view = finder.findById(source, 2131165350);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165350' for field 'mLayoutComment' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutComment = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165289);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165289' for field 'mEditInput' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mEditInput = (android.widget.EditText) view;
    view = finder.findById(source, 2131165290);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165290' for method 'onPostSendClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onPostSendClicked(p0);
        }
      });
    view = finder.findById(source, 2131165288);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165288' for method 'onPostCameraClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onPostCameraClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.MainActivity target) {
    target.mTabHost = null;
    target.mRadioGroup = null;
    target.mLayoutComment = null;
    target.mEditInput = null;
  }
}
