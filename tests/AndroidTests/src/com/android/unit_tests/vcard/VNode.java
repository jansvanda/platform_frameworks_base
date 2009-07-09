/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.unit_tests.vcard;

import java.util.ArrayList;

/**
 * @hide old class. Just for testing
 */
public class VNode {
    public String VName;

    public ArrayList<PropertyNode> propList = new ArrayList<PropertyNode>();

    /** 0:parse over. 1:parsing. */
    public int parseStatus = 1;
}
