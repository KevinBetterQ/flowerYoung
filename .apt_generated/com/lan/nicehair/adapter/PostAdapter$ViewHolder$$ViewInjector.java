// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PostAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.adapter.PostAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131165504);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165504' for field 'mPostChat' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostChat = (android.widget.TextView) view;
    view = finder.findById(source, 2131165502);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165502' for field 'mPostNameTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostNameTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165501);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165501' for field 'mPostHeadIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostHeadIv = (com.lan.nicehair.common.CircleImageView) view;
    view = finder.findById(source, 2131165505);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165505' for field 'mPostContent' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostContent = (android.widget.TextView) view;
    view = finder.findById(source, 2131165503);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165503' for field 'mPostTimeTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostTimeTv = (android.widget.TextView) view;
  }

  public static void reset(com.lan.nicehair.adapter.PostAdapter.ViewHolder target) {
    target.mPostChat = null;
    target.mPostNameTv = null;
    target.mPostHeadIv = null;
    target.mPostContent = null;
    target.mPostTimeTv = null;
  }
}
