/**
 * (C) Copyright IBM Corp. 2018,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.search.test;

import org.testng.annotations.Test;

import com.ibm.watsonhealth.fhir.model.Basic;

/**
 * @author lmsurpre
 * @see https://hl7.org/fhir/dstu2/search.html#reference
 */
public abstract class AbstractSearchReferenceTest extends AbstractPLSearchTest {
    
    @Test
    public void testCreateBasicResource() throws Exception {
        Basic resource = readResource(Basic.class, "BasicReference.json");
        saveBasicResource(resource);
    }
    
    @Test(dependsOnMethods = { "testCreateBasicResource" })
    public void testSearchReference_Reference_id() throws Exception {
        assertSearchReturnsSavedResource("Reference-id", "123");
        // Reference by id really only works when the system knows which resource type(s) 
        // can be referenced from a given element.
        // TODO does this work if you define the extension in a StructureDefinition 
        // and declare the allowed types? 
//        assertSearchReturnsSavedResource("Reference-id", "Patient/123");
        
        // TODO if this matched the hostname that the test was running on, would it work?
//        assertSearchReturnsSavedResource("Reference-id", "https://example.com/Patient/123");
        
//        assertSearchReturnsSavedResource("Reference-id:Patient", "123");
    }
    
    @Test(dependsOnMethods = { "testCreateBasicResource" })
    public void testSearchReference_Reference_relative() throws Exception {
        // Reference by id really only works when the system knows which resource type(s) 
        // can be referenced from a given element.
        // TODO does this work if you define the extension in a StructureDefinition 
        // and declare the allowed types? 
//        assertSearchReturnsSavedResource("Reference-relative", "123");
        
        assertSearchReturnsSavedResource("Reference-relative", "Patient/123");
        
        // TODO if this matched the hostname that the test was running on, would it work?
//        assertSearchReturnsSavedResource("Reference-relative", "https://example.com/Patient/123");
        
        assertSearchReturnsSavedResource("Reference-relative:Patient", "123");
        assertSearchDoesntReturnSavedResource("Reference-relative:Basic", "123");
        
    }
    
    @Test(dependsOnMethods = { "testCreateBasicResource" })
    public void testSearchReference_Reference_absolute() throws Exception {
        // TODO if the resource contained an absolute URI which matches the hostname
        // where the current test was running, would these work?
//        assertSearchReturnsSavedResource("Reference-absolute", "123");
//        assertSearchReturnsSavedResource("Reference-absolute", "Patient/123");
//        assertSearchReturnsSavedResource("Reference-absolute:Patient", "123");        
        
        assertSearchReturnsSavedResource("Reference-absolute", "https://example.com/Patient/123");
    }
    
    @Test(dependsOnMethods = { "testCreateBasicResource" })
    public void testSearchReference_uri() throws Exception {
        assertSearchReturnsSavedResource("uri", "urn:uuid:53fefa32-1111-2222-3333-55ee120877b7");
    }
}