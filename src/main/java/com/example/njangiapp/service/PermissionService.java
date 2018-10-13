package com.example.njangiapp.service;


import com.example.njangiapp.model.Permission;

import java.util.Collection;

/**
 * Service that provides CRUD operations for permission
 **/
public interface PermissionService {

    /**
     * Get all permissions in the system.
     *
     * @return Collection of all permissions in the system
     */
    public Collection<Permission> findAll();

    /**
     * Find a permission by Id.
     *
     * @param permissionId
     * @return Permission object if found, else return null
     */
    public Permission findById(int id);

    /**
     * Find a permission by name.
     *
     * @param name
     * @return Permission object if found, else return null
     */
    public Permission findByName(String name);

    /**
     * Create a new permission.
     *
     * @param permission
     * @return Permission object (created Permission object)
     */
    public Permission create(Permission permission);

    /**
     * Update an existing permission.
     *
     * @param permission
     * @return Permission object (updated Permission object)
     */
    public Permission update(Permission permission);

}
