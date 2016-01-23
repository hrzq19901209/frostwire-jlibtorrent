/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class posix_stat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected posix_stat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(posix_stat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_posix_stat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSt_size(long value) {
    libtorrent_jni.posix_stat_st_size_set(swigCPtr, this, value);
  }

  public long getSt_size() {
    return libtorrent_jni.posix_stat_st_size_get(swigCPtr, this);
  }

  public void setSt_atime(long value) {
    libtorrent_jni.posix_stat_st_atime_set(swigCPtr, this, value);
  }

  public long getSt_atime() {
    return libtorrent_jni.posix_stat_st_atime_get(swigCPtr, this);
  }

  public void setSt_mtime(long value) {
    libtorrent_jni.posix_stat_st_mtime_set(swigCPtr, this, value);
  }

  public long getSt_mtime() {
    return libtorrent_jni.posix_stat_st_mtime_get(swigCPtr, this);
  }

  public void setSt_ctime(long value) {
    libtorrent_jni.posix_stat_st_ctime_set(swigCPtr, this, value);
  }

  public long getSt_ctime() {
    return libtorrent_jni.posix_stat_st_ctime_get(swigCPtr, this);
  }

  public void setSt_mode(int value) {
    libtorrent_jni.posix_stat_st_mode_set(swigCPtr, this, value);
  }

  public int getSt_mode() {
    return libtorrent_jni.posix_stat_st_mode_get(swigCPtr, this);
  }

  public posix_stat() {
    this(libtorrent_jni.new_posix_stat(), true);
  }

}
