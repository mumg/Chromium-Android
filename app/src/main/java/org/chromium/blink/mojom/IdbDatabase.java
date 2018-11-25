
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/indexeddb/indexeddb.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface IdbDatabase extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends IdbDatabase, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<IdbDatabase, IdbDatabase.Proxy> MANAGER = IdbDatabase_Internal.MANAGER;


    void createObjectStore(
long transactionId, long objectStoreId, org.chromium.mojo_base.mojom.String16 name, IdbKeyPath keyPath, boolean autoIncrement);



    void deleteObjectStore(
long transactionId, long objectStoreId);



    void renameObjectStore(
long transactionId, long objectStoreId, org.chromium.mojo_base.mojom.String16 newName);



    void createTransaction(
long transactionId, long[] objectStoreIds, int mode);



    void close(
);



    void versionChangeIgnored(
);



    void addObserver(
long transactionId, int observerId, boolean includeTransaction, boolean noRecords, boolean values, short operationTypes);



    void removeObservers(
int[] observers);



    void get(
long transactionId, long objectStoreId, long indexId, IdbKeyRange keyRange, boolean keyOnly, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void getAll(
long transactionId, long objectStoreId, long indexId, IdbKeyRange keyRange, boolean keyOnly, long maxCount, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void put(
long transactionId, long objectStoreId, IdbValue value, IdbKey key, int mode, IdbIndexKeys[] indexKeys, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void setIndexKeys(
long transactionId, long objectStoreId, IdbKey primaryKey, IdbIndexKeys[] indexKeys);



    void setIndexesReady(
long transactionId, long objectStoreId, long[] indexIds);



    void openCursor(
long transactionId, long objectStoreId, long indexId, IdbKeyRange keyRange, int direction, boolean keyOnly, int taskType, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void count(
long transactionId, long objectStoreId, long indexId, IdbKeyRange keyRange, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void deleteRange(
long transactionId, long objectStoreId, IdbKeyRange keyRange, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void clear(
long transactionId, long objectStoreId, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported callbacks);



    void createIndex(
long transactionId, long objectStoreId, long indexId, org.chromium.mojo_base.mojom.String16 name, IdbKeyPath keyPath, boolean unique, boolean multiEntry);



    void deleteIndex(
long transactionId, long objectStoreId, long indexId);



    void renameIndex(
long transactionId, long objectStoreId, long indexId, org.chromium.mojo_base.mojom.String16 newName);



    void abort(
long transactionId);



    void commit(
long transactionId);


}