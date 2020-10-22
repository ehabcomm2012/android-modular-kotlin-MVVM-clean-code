package com.ehab.modular.domain.utils

interface EntityMapper<EntityModel,DomainModel> {
    fun mapFromEnitityModel(entityModel: EntityModel):DomainModel
    fun mapFromDomainModel(domainModel: DomainModel):EntityModel
}