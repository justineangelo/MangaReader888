package com.justineangelo888.mangareader888.SSApi.Models.Main.Sub;

import com.justineangelo888.mangareader888.SSApi.Models.Response.Attachment;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Attachments;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Business;
import com.justineangelo888.mangareader888.SSApi.Models.Response.BusinessStatus;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Category;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Lead;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Messages;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Notes;
import com.justineangelo888.mangareader888.SSApi.Models.Response.QuoteTemplates;
import com.justineangelo888.mangareader888.SSApi.Models.Response.SubCategories;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Suburb;
import com.justineangelo888.mangareader888.SSApi.Models.Response.User;

/**
     * Created by justine on 21/04/16.
     */
    public class SubRelationship {
        private Business business;
        private Lead leads;
        private User user;
        private BusinessStatus business_statuses;
        private Suburb suburb;
        private Attachments attachments;
        private Attachments eoi_attachments;
        private SubCategories sub_categories;
        private SubCategories job_filter_sub_categories;
        private Category category;
        private Messages messages;
        private Notes notes;
        private QuoteTemplates eoi_templates;

        public static SubRelationship init() {
            return new SubRelationship();
        }

        public Business getBusiness() {
            return business;
        }

        public SubRelationship setBusiness(Business business) {
            this.business = business;
            return this;
        }

        public Lead getLeads() {
            return leads;
        }

        public SubRelationship setLeads(Lead leads) {
            this.leads = leads;
            return this;
        }

        public User getUser() {
            return user;
        }

        public SubRelationship setUser(User user) {
            this.user = user;
            return this;
        }

        public BusinessStatus getBusiness_statuses() {
            return business_statuses;
        }

        public SubRelationship setBusiness_statuses(BusinessStatus business_statuses) {
            this.business_statuses = business_statuses;
            return this;
        }

        public Suburb getSuburb() {
            return suburb;
        }

        public SubRelationship setSuburbs(Suburb suburb) {
            this.suburb = suburb;
            return this;
        }

        public Attachments getAttachments() {
            return attachments;
        }

        public SubRelationship setAttachments(Attachments attachments) {
            this.attachments = attachments;
            return this;
        }

        public SubRelationship setSuburb(Suburb suburb) {
            this.suburb = suburb;
            return this;
        }

        public SubCategories getSub_categories() {
            return sub_categories;
        }

        public SubRelationship setSub_categories(SubCategories sub_categories) {
            this.sub_categories = sub_categories;
            return this;
        }

        public Category getCategory() {
            return category;
        }

        public SubRelationship setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Messages getMessages() {
            return messages;
        }

        public SubRelationship setMessages(Messages messages) {
            this.messages = messages;
            return this;
        }

        public Notes getNotes() {
            return notes;
        }

        public SubRelationship setNotes(Notes notes) {
            this.notes = notes;
            return this;
        }

        public QuoteTemplates getEoi_templates() {
            return eoi_templates;
        }

        public SubRelationship setEoi_templates(QuoteTemplates eoi_templates) {
            this.eoi_templates = eoi_templates;
            return this;
        }

        public SubCategories getJob_filter_sub_categories() {
            return job_filter_sub_categories;
        }

        public SubRelationship setJob_filter_sub_categories(SubCategories job_filter_sub_categories) {
            this.job_filter_sub_categories = job_filter_sub_categories;
            return this;
        }

        public Attachments getEoi_attachments() {
            return eoi_attachments;
        }

        public SubRelationship setEoi_attachments(Attachments eoi_attachments) {
            this.eoi_attachments = eoi_attachments;
            return this;
        }
}