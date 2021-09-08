package com.sunset.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.song.sunset.comic.bean.ComicLocalCollection;

import com.sunset.greendao.gen.ComicLocalCollectionDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig comicLocalCollectionDaoConfig;

    private final ComicLocalCollectionDao comicLocalCollectionDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        comicLocalCollectionDaoConfig = daoConfigMap.get(ComicLocalCollectionDao.class).clone();
        comicLocalCollectionDaoConfig.initIdentityScope(type);

        comicLocalCollectionDao = new ComicLocalCollectionDao(comicLocalCollectionDaoConfig, this);

        registerDao(ComicLocalCollection.class, comicLocalCollectionDao);
    }
    
    public void clear() {
        comicLocalCollectionDaoConfig.clearIdentityScope();
    }

    public ComicLocalCollectionDao getComicLocalCollectionDao() {
        return comicLocalCollectionDao;
    }

}