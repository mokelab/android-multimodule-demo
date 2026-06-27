package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data011RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data012RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data013RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data014RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data015RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data016RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data017RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data018RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data019RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data020RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen002ViewModel @Inject constructor(
    private val repo1: Data011RepositoryImpl,
    private val repo2: Data012RepositoryImpl,
    private val repo3: Data013RepositoryImpl,
    private val repo4: Data014RepositoryImpl,
    private val repo5: Data015RepositoryImpl,
    private val repo6: Data016RepositoryImpl,
    private val repo7: Data017RepositoryImpl,
    private val repo8: Data018RepositoryImpl,
    private val repo9: Data019RepositoryImpl,
    private val repo10: Data020RepositoryImpl,

): ViewModel() {
}
