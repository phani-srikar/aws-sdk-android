/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpcsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcs(DescribeVpcsRequest) DescribeVpcs operation}.
 * <p>
 * Describes one or more of your VPCs.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcs(DescribeVpcsRequest)
 */
public class DescribeVpcsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpcsRequest> {

    /**
     * One or more VPC IDs. <p>Default: Describes all your VPCs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIds;

    /**
     * One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     * of the VPC. The CIDR block you specify must exactly match the VPC's
     * CIDR block for information to be returned for the VPC. Must contain
     * the slash followed by one or two digits (for example,
     * <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     * of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     * Indicates whether the VPC is the default VPC. </li> <li>
     * <p><code>state</code> - The state of the VPC (<code>pending</code> |
     * <code>available</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     * </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more VPC IDs. <p>Default: Describes all your VPCs.
     *
     * @return One or more VPC IDs. <p>Default: Describes all your VPCs.
     */
    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
              vpcIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcIds.setAutoConstruct(true);
        }
        return vpcIds;
    }
    
    /**
     * One or more VPC IDs. <p>Default: Describes all your VPCs.
     *
     * @param vpcIds One or more VPC IDs. <p>Default: Describes all your VPCs.
     */
    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcIds.size());
        vpcIdsCopy.addAll(vpcIds);
        this.vpcIds = vpcIdsCopy;
    }
    
    /**
     * One or more VPC IDs. <p>Default: Describes all your VPCs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcIds One or more VPC IDs. <p>Default: Describes all your VPCs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcsRequest withVpcIds(String... vpcIds) {
        if (getVpcIds() == null) setVpcIds(new java.util.ArrayList<String>(vpcIds.length));
        for (String value : vpcIds) {
            getVpcIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more VPC IDs. <p>Default: Describes all your VPCs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcIds One or more VPC IDs. <p>Default: Describes all your VPCs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcsRequest withVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcIds.size());
            vpcIdsCopy.addAll(vpcIds);
            this.vpcIds = vpcIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     * of the VPC. The CIDR block you specify must exactly match the VPC's
     * CIDR block for information to be returned for the VPC. Must contain
     * the slash followed by one or two digits (for example,
     * <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     * of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     * Indicates whether the VPC is the default VPC. </li> <li>
     * <p><code>state</code> - The state of the VPC (<code>pending</code> |
     * <code>available</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     * </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     *         of the VPC. The CIDR block you specify must exactly match the VPC's
     *         CIDR block for information to be returned for the VPC. Must contain
     *         the slash followed by one or two digits (for example,
     *         <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     *         of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     *         Indicates whether the VPC is the default VPC. </li> <li>
     *         <p><code>state</code> - The state of the VPC (<code>pending</code> |
     *         <code>available</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     * of the VPC. The CIDR block you specify must exactly match the VPC's
     * CIDR block for information to be returned for the VPC. Must contain
     * the slash followed by one or two digits (for example,
     * <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     * of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     * Indicates whether the VPC is the default VPC. </li> <li>
     * <p><code>state</code> - The state of the VPC (<code>pending</code> |
     * <code>available</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     * </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     *         of the VPC. The CIDR block you specify must exactly match the VPC's
     *         CIDR block for information to be returned for the VPC. Must contain
     *         the slash followed by one or two digits (for example,
     *         <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     *         of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     *         Indicates whether the VPC is the default VPC. </li> <li>
     *         <p><code>state</code> - The state of the VPC (<code>pending</code> |
     *         <code>available</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     *         </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     * of the VPC. The CIDR block you specify must exactly match the VPC's
     * CIDR block for information to be returned for the VPC. Must contain
     * the slash followed by one or two digits (for example,
     * <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     * of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     * Indicates whether the VPC is the default VPC. </li> <li>
     * <p><code>state</code> - The state of the VPC (<code>pending</code> |
     * <code>available</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     *         of the VPC. The CIDR block you specify must exactly match the VPC's
     *         CIDR block for information to be returned for the VPC. Must contain
     *         the slash followed by one or two digits (for example,
     *         <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     *         of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     *         Indicates whether the VPC is the default VPC. </li> <li>
     *         <p><code>state</code> - The state of the VPC (<code>pending</code> |
     *         <code>available</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     * of the VPC. The CIDR block you specify must exactly match the VPC's
     * CIDR block for information to be returned for the VPC. Must contain
     * the slash followed by one or two digits (for example,
     * <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     * of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     * Indicates whether the VPC is the default VPC. </li> <li>
     * <p><code>state</code> - The state of the VPC (<code>pending</code> |
     * <code>available</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>cidr</code> - The CIDR block
     *         of the VPC. The CIDR block you specify must exactly match the VPC's
     *         CIDR block for information to be returned for the VPC. Must contain
     *         the slash followed by one or two digits (for example,
     *         <code>/28</code>). </li> <li> <p><code>dhcp-options-id</code> - The ID
     *         of a set of DHCP options. </li> <li> <p><code>isDefault</code> -
     *         Indicates whether the VPC is the default VPC. </li> <li>
     *         <p><code>state</code> - The state of the VPC (<code>pending</code> |
     *         <code>available</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC. </li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcsRequest> getDryRunRequest() {
        Request<DescribeVpcsRequest> request = new DescribeVpcsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcIds() != null) sb.append("VpcIds: " + getVpcIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcsRequest == false) return false;
        DescribeVpcsRequest other = (DescribeVpcsRequest)obj;
        
        if (other.getVpcIds() == null ^ this.getVpcIds() == null) return false;
        if (other.getVpcIds() != null && other.getVpcIds().equals(this.getVpcIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    