package grails.plugin.recurly.notifications

import grails.plugin.recurly.RecurlyAccount
import grails.plugin.recurly.RecurlySubscription
import grails.plugin.recurly.helpers.WebHookNotification

class RecurlyExpiredSubscriptionWebHookNotification extends WebHookNotification{

    public RecurlyAccount recurlyAccount
    public RecurlySubscription recurlySubscription

}
