
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/websocket.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface WebSocket extends org.chromium.mojo.bindings.Interface {


    
    public static final int INSUFFICIENT_RESOURCES = (int) 1L;




    public interface Proxy extends WebSocket, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WebSocket, WebSocket.Proxy> MANAGER = WebSocket_Internal.MANAGER;


    void addChannelRequest(
org.chromium.url.mojom.Url url, String[] requestedProtocols, org.chromium.url.mojom.Url firstPartyForCookies, HttpHeader[] additionalHeaders, WebSocketClient client);



    void sendFrame(
boolean fin, int type, byte[] data);



    void sendFlowControl(
long quota);



    void startClosingHandshake(
short code, String reason);


}
