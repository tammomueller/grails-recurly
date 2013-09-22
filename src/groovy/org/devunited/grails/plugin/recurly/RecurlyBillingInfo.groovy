package org.devunited.grails.plugin.recurly

import org.devunited.grails.plugin.recurly.helpers.RecurlyRESTResource
import org.devunited.grails.plugin.recurly.processors.RecurlyBillingInfoProcessor

class RecurlyBillingInfo extends RecurlyRESTResource {

    String accountCode
    String firstName
    String lastName
    String address1
    String address2
    String city
    String state
    String zip
    String country
    String ipAddress
    String phone

    RecurlyCreditCard creditCard

    String delete() {
        remove(accountCode)
    }

    RecurlyBillingInfo save() {
        createOrUpdate(accountCode, this)
        return this
    }

    String toString() {
        "RecurlyBillingInfo(firstName:'$firstName', lastName:'$lastName', address1:'$address1', address2:'$address2', city:'$city', country:'$country')"
    }

    // STATIC REST METHODS

    static RecurlyBillingInfo createOrUpdate(String accountCode, RecurlyBillingInfo recurlyBillingInfo) {
        handleResponse(new RecurlyBillingInfoProcessor(recurlyBillingInfo).createOrUpdate(accountCode))
    }

    static RecurlyBillingInfo fetch(String accountCode) {
        handleResponse( new RecurlyBillingInfoProcessor().getBillingDetails(accountCode))
    }

    static String remove(String accountCode) {
        handleResponse(new RecurlyBillingInfoProcessor().delete(accountCode))
    }
    

}