@file:Suppress("NOTHING_TO_INLINE")

package com.github.satoshun.io.reactivex.keeporder

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single

/**
 * attach [Flowable] stream and [RxKeepOrder].
 */
inline fun <T> Flowable<T>.keepOrder(seed: RxKeepOrder): Flowable<T> = this.compose(seed.attach())

/**
 * attach [Observable] stream and [RxKeepOrder].
 */
inline fun <T> Observable<T>.keepOrder(seed: RxKeepOrder): Observable<T> = this.compose(seed.attach())

/**
 * attach [Single] stream and [RxKeepOrder].
 */
inline fun <T> Single<T>.keepOrder(seed: RxKeepOrder): Single<T> = this.compose(seed.attach())

/**
 * attach [Maybe] stream and [RxKeepOrder].
 */
inline fun <T> Maybe<T>.keepOrder(seed: RxKeepOrder): Maybe<T> = this.compose(seed.attach())

/**
 * attach [Completable] stream and [RxKeepOrder].
 */
inline fun Completable.keepOrder(seed: RxKeepOrder): Completable = this.compose(seed.attach<Any>())
