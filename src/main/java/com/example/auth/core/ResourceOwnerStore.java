package com.example.auth.core;

/**
 * @author Ivan Stefanov <ivan.stefanov@clouway.com>
 */
public interface ResourceOwnerStore {
  void save(ResourceOwner resourceOwner);
}