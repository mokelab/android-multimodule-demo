package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data031RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data032RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data033RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data034RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data035RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data036RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data037RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data038RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data039RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data040RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen004ViewModel @Inject constructor(
    private val repo1: Data031RepositoryImpl,
    private val repo2: Data032RepositoryImpl,
    private val repo3: Data033RepositoryImpl,
    private val repo4: Data034RepositoryImpl,
    private val repo5: Data035RepositoryImpl,
    private val repo6: Data036RepositoryImpl,
    private val repo7: Data037RepositoryImpl,
    private val repo8: Data038RepositoryImpl,
    private val repo9: Data039RepositoryImpl,
    private val repo10: Data040RepositoryImpl,

): ViewModel() {
}
