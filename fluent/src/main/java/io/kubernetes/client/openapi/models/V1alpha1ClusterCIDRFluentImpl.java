/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1alpha1ClusterCIDRFluentImpl<A extends V1alpha1ClusterCIDRFluent<A>>
    extends BaseFluent<A> implements V1alpha1ClusterCIDRFluent<A> {
  public V1alpha1ClusterCIDRFluentImpl() {}

  public V1alpha1ClusterCIDRFluentImpl(V1alpha1ClusterCIDR instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());
  }

  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha1ClusterCIDRSpecBuilder spec;

  public String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public String getKind() {
    return this.kind;
  }

  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }

  public Boolean hasKind() {
    return this.kind != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    } else {
      this.metadata = null;
      _visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }

  public Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> withNewMetadata() {
    return new V1alpha1ClusterCIDRFluentImpl.MetadataNestedImpl();
  }

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha1ClusterCIDRFluentImpl.MetadataNestedImpl(item);
  }

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null ? getMetadata() : new V1ObjectMetaBuilder().build());
  }

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ClusterCIDRSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public V1alpha1ClusterCIDRSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(V1alpha1ClusterCIDRSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new V1alpha1ClusterCIDRSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    } else {
      this.spec = null;
      _visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }

  public Boolean hasSpec() {
    return this.spec != null;
  }

  public V1alpha1ClusterCIDRFluent.SpecNested<A> withNewSpec() {
    return new V1alpha1ClusterCIDRFluentImpl.SpecNestedImpl();
  }

  public V1alpha1ClusterCIDRFluent.SpecNested<A> withNewSpecLike(V1alpha1ClusterCIDRSpec item) {
    return new V1alpha1ClusterCIDRFluentImpl.SpecNestedImpl(item);
  }

  public V1alpha1ClusterCIDRFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }

  public V1alpha1ClusterCIDRFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null ? getSpec() : new V1alpha1ClusterCIDRSpecBuilder().build());
  }

  public V1alpha1ClusterCIDRFluent.SpecNested<A> editOrNewSpecLike(V1alpha1ClusterCIDRSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1ClusterCIDRFluentImpl that = (V1alpha1ClusterCIDRFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, spec, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (spec != null) {
      sb.append("spec:");
      sb.append(spec);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V1alpha1ClusterCIDRFluent.MetadataNested<N>>
      implements V1alpha1ClusterCIDRFluent.MetadataNested<N>, Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }

    V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1alpha1ClusterCIDRFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class SpecNestedImpl<N>
      extends V1alpha1ClusterCIDRSpecFluentImpl<V1alpha1ClusterCIDRFluent.SpecNested<N>>
      implements V1alpha1ClusterCIDRFluent.SpecNested<N>, Nested<N> {
    SpecNestedImpl(V1alpha1ClusterCIDRSpec item) {
      this.builder = new V1alpha1ClusterCIDRSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder = new V1alpha1ClusterCIDRSpecBuilder(this);
    }

    V1alpha1ClusterCIDRSpecBuilder builder;

    public N and() {
      return (N) V1alpha1ClusterCIDRFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }
}