package com.example.njangiapp.service;

import com.example.njangiapp.model.Role;

import java.util.Collection;

public interface RoleService {

    /**
     * Get all roles in the system.
     *
     * @return cCollection of roles
     */
    public Collection<Role> findAll();

    /**
     * Find a role by Id.
     *
     * @param roleId
     * @return the role object if found, else return null
     */
    public Role findById(int id);

    /**
     * Find a role by name.
     *
     * @param name
     * @return the role object if found, else return null
     */
    public Role findByName(String name);

    /**
     * Create a new role.
     *
     * @param role
     * @return Role object (created role object)
     */
    public Role create(Role role);

    /**
     * Update an existing role.
     *
     * @param role
     * @return Role object (updated role object)
     */
    public Role update(Role role);
}