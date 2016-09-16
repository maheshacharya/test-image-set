package org.example.beans;

/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;


@HippoEssentialsGenerated(internalName = "myhippoproject:rosterdocument")
@Node(jcrType = "myhippoproject:rosterdocument")
public class RosterDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "myhippoproject:name")
    public String getName() {
        return getProperty("myhippoproject:name");
    }

    @HippoEssentialsGenerated(internalName = "myhippoproject:number")
    public Long getNumber() {
        return getProperty("myhippoproject:number");
    }

    @HippoEssentialsGenerated(internalName = "myhippoproject:position")
    public String getPosition() {
        return getProperty("myhippoproject:position");
    }

    @HippoEssentialsGenerated(internalName = "myhippoproject:description")
    public HippoHtml getDescription() {
        return getHippoHtml("myhippoproject:description");
    }

    @HippoEssentialsGenerated(internalName = "myhippoproject:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean("myhippoproject:image", HippoGalleryImageSet.class);
    }
}

