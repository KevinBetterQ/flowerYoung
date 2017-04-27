// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PostInfoActivity$ViewHeadHolder$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.PostInfoActivity.ViewHeadHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131165513);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165513' for field 'mLayoutCollect' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutCollect = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165409);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165409' for field 'mCollectTag' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mCollectTag = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165515);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165515' for field 'mLayoutComment' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutComment = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165411);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165411' for field 'mLikeTag' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLikeTag = (android.widget.ImageView) view;
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
    view = finder.findById(source, 2131165510);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165510' for field 'mPostList' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostList = (com.lan.nicehair.widget.NoScrollListView) view;
    view = finder.findById(source, 2131165512);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165512' for field 'mLayoutShare' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutShare = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165506);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165506' for field 'mUserLevelTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mUserLevelTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165511);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165511' for field 'mPostBottomLayout' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostBottomLayout = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165514);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165514' for field 'mLayoutLike' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutLike = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165509);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165509' for field 'mPostContent' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostContent = (android.widget.TextView) view;
    view = finder.findById(source, 2131165503);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165503' for field 'mPostTimeTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostTimeTv = (android.widget.TextView) view;
  }

  public static void reset(com.lan.nicehair.activity.PostInfoActivity.ViewHeadHolder target) {
    target.mLayoutCollect = null;
    target.mCollectTag = null;
    target.mLayoutComment = null;
    target.mLikeTag = null;
    target.mPostNameTv = null;
    target.mPostHeadIv = null;
    target.mPostList = null;
    target.mLayoutShare = null;
    target.mUserLevelTv = null;
    target.mPostBottomLayout = null;
    target.mLayoutLike = null;
    target.mPostContent = null;
    target.mPostTimeTv = null;
  }
}
