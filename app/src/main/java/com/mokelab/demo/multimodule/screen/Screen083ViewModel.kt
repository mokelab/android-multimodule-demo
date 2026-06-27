package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data821RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data822RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data823RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data824RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data825RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data826RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data827RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data828RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data829RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data830RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen083ViewModel @Inject constructor(
    private val repo1: Data821RepositoryImpl,
    private val repo2: Data822RepositoryImpl,
    private val repo3: Data823RepositoryImpl,
    private val repo4: Data824RepositoryImpl,
    private val repo5: Data825RepositoryImpl,
    private val repo6: Data826RepositoryImpl,
    private val repo7: Data827RepositoryImpl,
    private val repo8: Data828RepositoryImpl,
    private val repo9: Data829RepositoryImpl,
    private val repo10: Data830RepositoryImpl,

): ViewModel() {
}
