
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cache_storage/cache_storage.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface CacheStorageCache extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CacheStorageCache, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CacheStorageCache, CacheStorageCache.Proxy> MANAGER = CacheStorageCache_Internal.MANAGER;


    void match(
FetchApiRequest request, QueryParams queryParams, 
MatchResponse callback);

    interface MatchResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<MatchResult> { }



    void matchAll(
FetchApiRequest request, QueryParams queryParams, 
MatchAllResponse callback);

    interface MatchAllResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<MatchAllResult> { }



    void keys(
FetchApiRequest request, QueryParams queryParams, 
KeysResponse callback);

    interface KeysResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<CacheKeysResult> { }



    void batch(
BatchOperation[] batchOperations, boolean failOnDuplicates, 
BatchResponse callback);

    interface BatchResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<CacheStorageVerboseError> { }



    void setSideData(
org.chromium.url.mojom.Url url, org.chromium.mojo_base.mojom.Time responseTime, byte[] sideData, 
SetSideDataResponse callback);

    interface SetSideDataResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


}
