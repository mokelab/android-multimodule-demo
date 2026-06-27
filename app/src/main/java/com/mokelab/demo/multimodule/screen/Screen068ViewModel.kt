package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data671RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data672RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data673RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data674RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data675RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data676RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data677RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data678RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data679RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data680RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen068ViewModel @Inject constructor(
    private val repo1: Data671RepositoryImpl,
    private val repo2: Data672RepositoryImpl,
    private val repo3: Data673RepositoryImpl,
    private val repo4: Data674RepositoryImpl,
    private val repo5: Data675RepositoryImpl,
    private val repo6: Data676RepositoryImpl,
    private val repo7: Data677RepositoryImpl,
    private val repo8: Data678RepositoryImpl,
    private val repo9: Data679RepositoryImpl,
    private val repo10: Data680RepositoryImpl,

): ViewModel() {
}
